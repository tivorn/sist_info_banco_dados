// Desenvolvedor: Victor Meneses Navarro Fernandes

package tp2;

public class Main {
	
	public static void main(String[] args) {
		Student student = new Student();
		Subject subject = new Subject();
		
		String[] students = {
			"João", "Maria",
			"José", "Mariana",
			"Jorge", "Marivania",
			"Jone", "Marta",
			"Juvêncio", "Marina"
		};
		
		double[] grades1 = {
				3.5, 5.5,
				2.5, 7.6,
				8.7, 9.3,
				1.1, 10,
				9.9, 9.8
		};
		
		double[] grades2 = {
				4.5, 6.5,
				3.5, 8.6,
				9.7, 10,
				2.1, 10,
				10, 10
		};
		
		for (int i = 0; i < students.length; i++) {
			student.setName(students[i]);
			student.setId(i);
			
			subject.setStudentToSubject(student.getName(), student.getId());
		}
		
		for (int i = 0; i < grades1.length; i++) {
			student.setId(i);
			student.grade1 = grades1[i];
			
			subject.setStudentGrade1ToSubject(student.grade1, student.getId());
		}
		
		for (int i = 0; i < grades2.length; i++) {
			student.setId(i);
			student.grade2 = grades2[i];
			
			subject.setStudentGrade2ToSubject(student.grade2, student.getId());
		}
		
		
		System.out.println("A média dos alunos(as) na primeira prova da disciplina foi " + subject.getMeanClassGrades1());
		System.out.println("A média dos alunos(as) na segunda prova da disciplina foi " + subject.getMeanClassGrades2());
		
		for (int i = 0; i < subject.students.length; i++) {
			student.grade1 = subject.classGrades1[i];
			student.grade2 = subject.classGrades2[i];
			
			System.out.println("A média das duas avaliação do aluno(a) " + subject.students[i] + " foi " + student.getMean());
			
			if (student.approved()) {
				System.out.println("O aluno(a) " + subject.students[i] + " foi aprovado(a)");
			} else {
				System.out.println("O aluno(a) " + subject.students[i] + " não foi aprovado(a)");
			}
		}
	}
}
