package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
	Curso curso1 = new Curso ();
	curso1.setTitulo("curso Java");
	curso1.setDescricao("descri��o curso Java");
	curso1.setCargaHoraria(8);
	
	Curso curso2 = new Curso ();
	curso2.setTitulo("curso js");
	curso2.setDescricao("descri��o curso js");
	curso2.setCargaHoraria(4);
	
	Mentoria mentoria = new Mentoria();
	mentoria.setTitulo("mentoria de Java");
	mentoria.setDescricao("descri��o mentoria Java");
	mentoria.setData(LocalDate.now());
	
	System.out.println(curso1);
	System.out.println(curso2);
	System.out.println(mentoria);
	
	Bootcamp bootcamp = new Bootcamp();
	bootcamp.setNome("Bootcamp Java Developer");
	bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
	bootcamp.getConteudos().add(curso1); 
	bootcamp.getConteudos().add(curso2); 
	bootcamp.getConteudos().add(mentoria);
	
	Dev devLidia = new Dev();
	devLidia.setNome("Lidia");
	devLidia.inscreverBootcamp(bootcamp);
	System.out.println("Conte�dos Inscritos" + devLidia.getConteudosInscritos());
	devLidia.progredir();
	devLidia.progredir();
	System.out.println("-");
	System.out.println("Conte�dos Inscritos" + devLidia.getConteudosInscritos());
	System.out.println("Conte�dos Conclu�dos" + devLidia.getConteudosConcluidos());
	System.out.println("XP:" + devLidia.CalcularTotalXp());
	
	System.out.println("-------");
	
	Dev devEduardo = new Dev();
	devEduardo.setNome("Eduardo");
	devEduardo.inscreverBootcamp(bootcamp);
	System.out.println("Conte�dos Inscritos" + devEduardo.getConteudosInscritos());
	devEduardo.progredir();
	devEduardo.progredir();
	devEduardo.progredir();
	System.out.println("-");
	System.out.println("Conte�dos Inscritos" + devEduardo.getConteudosInscritos());
	System.out.println("Conte�dos Conclu�dos" + devEduardo.getConteudosConcluidos());
	System.out.println("XP:" + devEduardo.CalcularTotalXp());
	
	}

	
	}
	

