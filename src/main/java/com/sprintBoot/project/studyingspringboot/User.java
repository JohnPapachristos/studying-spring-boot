package com.sprintBoot.project.studyingspringboot;

public class User {
		// The call will contain:
		// User: id, name, author
		public long id;
		public String firstName;
		public String lastName;
		
		public User(final long id, final String firstName, final String lastName) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public void setId(final long id) {
			this.id = id;
		}
		
		public void setName(final String firstName) {
			this.firstName = firstName;
		}
		
		public void setAuthor(final String lastName) {
			this.lastName = lastName;
		}
		
		public long getId() {
			return this.id;
		}
		
		public String getName() {
			return this.firstName;
		}
		
		public String getAuthor() {
			return this.lastName;
		}
		
		@Override
		public String toString() {
			return this.id + " " + this.firstName + " " + this.lastName;
		}
}
