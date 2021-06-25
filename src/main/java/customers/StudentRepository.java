package customers;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> getAllByName();
    List<Student> findStudentsByName(String name);
    Student getStudentsByPhoneNumber(int phoneNumber);
    List<Student> getStudentsByAddress_City(String city);


    //    @Query()
//    List<Student> getAllStudents();


}
