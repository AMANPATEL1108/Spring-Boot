package com.jpa.test;

import com.jpa.test.dao.Userrepository;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.awt.*;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);

		Userrepository userrepository=context.getBean(Userrepository.class);

		//insert user
//		User user=new User();
//		user.setName("AMAN PATEL");
//		user.setCity("BAYAD");
//		user.setStatus("STUDENT");
//		User user1= userrepository.save(user);
//
//		System.out.println(user1);

//		User user1=new User();
//		user1.setName(("Deversh"));
//		user1.setCity("DEMAI");
//		user1.setStatus("JOB");
//
//		User user2=new User();
//		user2.setName(("ANIL"));
//		user2.setCity("GANPAT");
//		user2.setStatus("NOTHING");
//
////		User resultUser=userrepository.save(user2);
//		List<User> users=List.of(user1,user2);
//		Iterable<User> result=userrepository.saveAll(users);
//
//		result.forEach(user->{
//			System.out.println(user);
//		});
//
////		System.out.println("Saved user"+resultUser);
//		System.out.println("Done");
//
//		//update user
//		Optional<User> optional=userrepository.findById(53);
//		User user=optional.get();
//
//		user.setName("GT");
//		User result=userrepository.save(user);
//
//		System.out.println(result);

		//get data
	Iterable<User> itr= userrepository.findAll();
//	Iterator<User> iterator=itr.iterator();
//	while (iterator.hasNext()){
//		User user=iterator.next();
//		System.out.println(itr);
//
//	}
//
//		itr.forEach(new Consumer<User>() {
//			@Override
//			public void accept(User user) {
//
//			}
//		});
//		itr.forEach(user -> {
//			System.out.println(user);
//		});


		//Deleting

//		userrepository.deleteById(53);
//		System.out.println("deleted");

//		Iterable<User> allusers=userrepository.findAll();
//		allusers.forEach(user -> {
//			System.out.println(user);
//		});
//
//		userrepository.deleteAll(allusers);


//List<User> users=userrepository.findByName("AMAN PATEL");
//List<User> users=userrepository.findbyNameAndcity("AMAN PATEL","BAYAD");
//
//users.forEach(e -> System.out.println(e));


		List<User> allUser=userrepository.getAllUser();

		allUser.forEach(e-> {
			System.out.println(e);
		});

		List<User> userByName=userrepository.getUserByName("AMAN PATEL");
userByName.forEach(e->{
	System.out.println(e);
});
	}

}
