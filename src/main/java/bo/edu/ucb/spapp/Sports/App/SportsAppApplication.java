package bo.edu.ucb.spapp.Sports.App;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication

// Le indicamos a Spring que busque los mappers en este paquete
@MapperScan("bo.edu.ucb.spapp.Sports.App.dao")
public class SportsAppApplication {
	// SqlSessionFactory es un objeto que nos permite crear sesiones de MyBatis.
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		SqlSessionFactory sqlSessionFactory = factoryBean.getObject();
		sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
		return sqlSessionFactory;
	}
	public static void main(String[] args) {
		SpringApplication.run(SportsAppApplication.class, args);
	}
	

}
