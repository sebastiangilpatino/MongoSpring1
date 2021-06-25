package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        Student student;

		student = new Student("sebastian",561485781,"jorgegilpatino@gmail.com",
				new Address("102W Grimes Av","Fairfield", 52556));

		studentRepository.save(student);

		student = new Student("Maria",74589632,"Mm@gmail.com",
				new Address("102W Grimes Av","Fairfield", 52556));

		studentRepository.save(student);

		student = new Student("Naem",111111,"naem@gmail.com",
				new Address("Liberty","Fairfield", 52556));

		studentRepository.save(student);

		student = new Student("Milton",22222,"fredyg@gmail.com",
				new Address("Maharishi","Fairfield", 52556));

		studentRepository.save(student);

		student = new Student("Anderson",3333,"aa@gmail.com",
				new Address("Maharishi","Fairfield", 52556));

		studentRepository.save(student);

		//get Students
		//get all Students
		System.out.println(studentRepository.findAll());
		//get all students with certain Name
		System.out.println(studentRepository.findStudentsByName("Anderson"));
		//get a student with a certain phoneNumber
		System.out.println(studentRepository.getStudentsByPhoneNumber(561485781));
		//get all students from a certain city
		System.out.println(studentRepository.getStudentsByAddress_City("Fairfield"));


	}

}
