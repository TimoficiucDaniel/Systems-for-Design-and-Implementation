package group.lab1FINAL;

import group.lab1FINAL.Model.Cubes;
import group.lab1FINAL.Model.CubesProducer;
import group.lab1FINAL.Model.Producer;
import group.lab1FINAL.Model.Review;
import group.lab1FINAL.Repo.CubeRepo;
import group.lab1FINAL.Repo.CubesProducerRepo;
import group.lab1FINAL.Repo.ProducerRepo;
import group.lab1FINAL.Repo.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Lab1FinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lab1FinalApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}
	@Autowired
	private CubeRepo repo1;
	@Autowired
	private ReviewRepo repo2;

	@Autowired
	private ProducerRepo repo3;

	@Autowired
	private CubesProducerRepo repo4;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
//		Cubes cub1 = new Cubes("1",200,"1","1",true);
//		Cubes cub2 =new Cubes("2",300,"2","2",false);
//		Cubes cub3 =new Cubes("3",100,"1","6",false);
//		Cubes cub4 =new Cubes("45",500,"3","1",true);
//		Cubes cub5 =new Cubes("10",50,"4","4",false);
//
//		Review rev1 = new Review("varg","vargvarg", 6.9f,"8.11.2002",false,cub1);
//		Review rev2 = new Review("iannis","iannis e un madman", 9f,"29.09.2001",true,cub2);
//
//		Producer prod1 = new Producer("MoYu","Test Street","1234567890","moyu@outlook.com",500000);
//
//		CubesProducer cubesProducer1 = new CubesProducer(cub1,prod1,100,"20.10.2022");
//
//		repo1.save(cub1);
//		repo1.save(cub2);
//		repo1.save(cub3);
//		repo1.save(cub4);
//		repo1.save(cub5);
//
//		repo3.save(prod1);
//
//		repo2.save(rev1);
//		repo2.save(rev2);
//
//		repo4.save(cubesProducer1);

	}
}
