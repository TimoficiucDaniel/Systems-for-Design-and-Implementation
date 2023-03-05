package group.lab1FINAL;

import group.lab1FINAL.Model.Cubes;
import group.lab1FINAL.Repo.CubeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Lab1FinalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Lab1FinalApplication.class, args);
	}

	@Autowired
	private CubeRepo repo;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		Cubes cub1 = new Cubes("1",200,"1","1",true);
		Cubes cub2 =new Cubes("2",300,"2","2",false);
		Cubes cub3 =new Cubes("3",100,"1","6",false);
		Cubes cub4 =new Cubes("45",500,"3","1",true);
		Cubes cub5 =new Cubes("10",50,"4","4",false);
		repo.save(cub1);
		repo.save(cub2);
		repo.save(cub3);
		repo.save(cub4);
		repo.save(cub5);


	}
}
