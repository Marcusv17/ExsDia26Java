package com.mycompany.ex1dia26;



public class Ex1Dia26 {

    public static void main(String[] args) {
         Pessoa umaPessoa = new Pessoa();
         umaPessoa.nome = "Marcus";
         umaPessoa.sexo = "Masculino";
         umaPessoa.país = "Brasil";
         
         umaPessoa.pessoaAnda();
         umaPessoa.pessoaFala();
         umaPessoa.pessoaCorre();
         umaPessoa.pessoaEstuda();
         umaPessoa.pessoaBrinca();
        
        System.out.println("O nome da pessoa é : " + umaPessoa.nome + ".");      
        System.out.println("Essa pessoa é do sexo : " + umaPessoa.sexo + "."); 
        System.out.println("O país dessa pessoa é : " + umaPessoa.país + "."); 
        
        umaPessoa = null;
        
        
       
    }
}
    

