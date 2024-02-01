package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;


public class Application {

    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost/menudb";
    private static String USER = "ohgiraffers";
    private static String PASSWORD = "ohgiraffers";

    public static void main(String[] args) {

        /* DB 접속에 관한 환경 설정
        * JdbcTransactionFactory : 수동 커밋, ManagedTransactionFactory : 자동 커밋
        * PooledDataSource : 커넥션플 사용 , UnpooledDataSource : 커넥션풀 미사용  */
        Environment environment = new Environment(
                "dev",                     //환경 정보 이름 = 이름 아무거나 해도된다.
                new JdbcTransactionFactory(), //트랜잭션 매니저 종류 (JDBC or MANAGED)  = 수동커밋, 자동커밋 설정
                new PooledDataSource(DRIVER, URL, USER, PASSWORD)        // Connection pool 사용 유무 (Pooled or UnPooled) =  커넥션풀 사용 , 미사용 설정 : 커넥션풀 사용 할떄 DRIVER, URL, USER, PASSWORD 생성후 입력

        );

        /* 생성한 환경 설정 정보로 Mybatis */
        Configuration configuration = new Configuration(environment);

        /* 설정 객체에 매퍼등록  = Mapper 에 등록한 데이터 */
        configuration.addMapper(Mapper.class);

        /* SqlSessionFactory : SqlSession 객체를 생성하기 위한 팩토리 역할의 인터페이스
        *  SqlSessionFactoryBuilder : SqlSessionFactory 인터페이스 타입의 하위 구현 객체를 생성하기 위한 빌드 역할
        *  build() : 설정에 대한 정보를 담고 있는 Configuration 타입의 객체 혹은 외부 설정 파일과 연결된 stream을
        *  매개변수로 전달하면 SqlSessionFactory 인터페이스 타입의 객체를 반환하는 메소드 */
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);

        /* openSession() : SqlSession 타입의 인터페이슬 반환하는 메소드로 boolean 타입을 인자로 전달
        * - false : DML 수행 후 auto commit 옵션을 fasle로 지정 */
        SqlSession sqlSession = sqlSessionFactory.openSession(false);

        /* getMapper() : Configuration에 등록 된 매퍼를 동일 타입에 대해 반환하는 메소드 */
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        /* Mapper 인터페이스에 작성 된 메소드 호출하여 쿼리 실행 */
        java.util.Date date = mapper.selectDate();
        System.out.println(date);

        /* SqlSession 객체반납   SqlSession 메소드로 통해 객체를 반납할수 있다.  */
        sqlSession.close();





    }
}
