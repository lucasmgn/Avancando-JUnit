package com.curso.junit;

import org.junit.*;

public class EntendendoJunitTest {

    @BeforeClass //Inicia primeiro antes de todos os testes da classe
    public static void iniciarTestes(){
        System.out.println(">>>>>> public static void iniciarTestes() <<<<<<<<");
    }

    @AfterClass
    public static void encerrarTestes(){
        System.out.println(">>>>>> public static void encerrarTestes() <<<<<<<<");

    }

    @Before //Para ser executado antes de cada teste
    public void iniciarTeste(){
        System.out.println(">>>>>> public void iniciarTeste() <<<<<<<<");
    }

    @After //Para ser executado depois de cada teste
    public void encerrarTeste(){
        System.out.println(">>>>>> public void encerrarTeste() <<<<<<<<");
    }

    @Test
    public void testandoAlgo(){
        String nome = String.format("%s", "Lucas Magno");

        //Usando o assertEquals para fazer validação, o primeiro parâmetro é o que vc deseja oq apareça
        //e o segundo é o nome da variável que vc deseja validar,
        // ela precisa ter o valor igual o primeiro parâmetro.
        Assert.assertEquals("Lucas Magno", nome);
    }

    @Test
    public void testandoOutraCoisa(){
        String string = String.format("%s", "");

        //Devolve true ou false, string.isEmpty() estou dizendo q a string está vázia
        Assert.assertTrue(string.isEmpty());
    }

}
