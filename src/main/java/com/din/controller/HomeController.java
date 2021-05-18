package com.din.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.din.model.Student;
import com.din.repository.StudentRepo;
import com.din.service.StudentService;
import com.din.service.StudentServiceImp;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class HomeController {

	private StudentRepo studentRepo; 
	private StudentService studentService;
	@Autowired
	private StudentServiceImp stuServiceImpl;
	
	@Autowired
	public HomeController(StudentRepo studentRepo, StudentService studentService) {
		super();
		this.studentRepo = studentRepo;
		this.studentService = studentService;
	}




//    @PostMapping("/addStudent")
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String saveOrUpdateStudent(@RequestBody Student student) {
		studentRepo.save(student); 
		return "Student save " + student.getId();
	}
	 
	
	@GetMapping("/findAllStudents")
	public List<Student> findAllStudents(){
		return studentRepo.findAll();
	}
	
	@RequestMapping(value = "/findAllStudents/{id}" , method = RequestMethod.GET)
	public Optional<Student> findStudentbyId(@PathVariable int id) {
		return studentRepo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleleStudent(@PathVariable int id) {
		studentRepo.deleteById(id);
		return "Delete id is :" + id;
	}
	
	
	
	//for testing purpose
	public Student getStu() {
		final String cell = "32423432";
		Student s = studentRepo.findByCell(cell);
		Student s2 = studentRepo.findByNameAndCell("din", cell);
		return studentRepo.findByName("din");
	}

	public Student saveStu() {
		Student ss = stuServiceImpl.saveStu(new Student());
		return studentService.saveStudent(new Student(22, "din","2423", "sdfsdf@gmail.com"));
	}
}
