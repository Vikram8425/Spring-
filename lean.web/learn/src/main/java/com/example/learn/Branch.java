package com.example.learn;

public class Branch {

		private Student student;
		private String name;

		public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Branch [student=" + student + ", name=" + name + "]";
		}

		
}
