package com.sprintBoot.project.studyingspringboot;

public class Course {
		// The call will contain:
		// Course: id, name, author
		public long id;
		public String name;
		public String author;
		
		public Course(final long id, final String name, final String author) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
		}
		
		public void setId(final long id) {
			this.id = id;
		}
		
		public void setName(final String name) {
			this.name = name;
		}
		
		public void setAuthor(final String author) {
			this.author = author;
		}
		
		public long getId() {
			return this.id;
		}
		
		public String getName() {
			return this.name;
		}
		
		public String getAuthor() {
			return this.author;
		}
		
		@Override
		public String toString() {
			return this.id + " " + this.name + " " + this.author;
		}
}
