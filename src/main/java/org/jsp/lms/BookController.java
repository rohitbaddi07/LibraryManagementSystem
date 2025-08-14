package org.jsp.lms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController  //controller + Responsebody
public class BookController {
	
	@Autowired
	BookRepositry br;
	
	//@ResponseBody
	//@RequestMapping("/savebook")
	@PostMapping("/savebook")
	public Book saveBook(@RequestBody Book b) {
		return br.save(b);
	}
	
	//@ResponseBody
	//@RequestMapping("/findallbook")
	@GetMapping("/findallbook")
	public List<Book> findAll(){
		return br.findAll();
	}
	//@ResponseBody
	//@RequestMapping("/deletebyid")
	@DeleteMapping("/deletebyid")  //to get particular method run we use this.. 
	public String deleteById(@RequestParam int id) {
		br.deleteById(id);
		return "deleted sucessfully";
	}
	
	//@ResponseBody
	//@RequestMapping("/findbyid")
	@GetMapping("/findbyid")
	public Book findById(@RequestParam int id) {
		Book book = br.findById(id).get();
		return book;
	}

}
