package com.test.demo.entity;

public class Course {

	
		private long id ;
		private String name ;
		private String type ;
		
		
		
		
		public Course(long id, String name, String type) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
		}


		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}


		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}
		
		
		
		
		
		
}
