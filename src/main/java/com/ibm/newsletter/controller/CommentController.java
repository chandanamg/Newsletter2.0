package com.ibm.newsletter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.newsletter.dto.Comments;
import com.ibm.newsletter.service.CommentServiceImpl;

@RestController
public class CommentController {

@Autowired
CommentServiceImpl commentService;

	
@GetMapping(path="/getComments")
public List<Comments> getComments(){
		
		List<Comments> commentList=new ArrayList<>();
		
		commentList= commentService.getComments();
		
		return commentList;
		
		
	}

@PostMapping(path="/postComment")
public Comments saveComment(@RequestParam("comment") Comments comment) {

	
	String message="";
	
	return comment;
	
}

@PostMapping(path="/deleteComment")
public void deleteComment(@RequestParam("comment")Comments comment) {
	
}
	
	
	

}