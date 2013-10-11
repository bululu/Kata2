
package cata3;

import java.util.HashMap;

public class Cata3 {

    public static void main(String[] args) {
        //System.out.println((Person.getMaxage()));
        
        //Person paco=new Person("paco",15);
        //System.out.println(paco.getName()+" "+paco.getAge());
        
        HashMap<String,Integer> histogram=new HashMap<>();
        Person[] list= new Person[5];  
        list[0]=new Person("Ruyman",30);
        list[1]=new Person("Jose",25);
        list[2]=new Person("Adan",22);
        list[3]=new Person("Roberto",23);
        list[4]=new Person("Javier",19);
        
        String[] Preguntas= new String[12];
        
        Preguntas[0]="Ruyman";
        Preguntas[1]="Jose";
        Preguntas[2]="Adan";
        Preguntas[3]="Roberto";
        Preguntas[4]="Javier";
        Preguntas[5]="Adan";
        Preguntas[6]="Javier";
        Preguntas[7]="Roberto";
        Preguntas[8]="Adan";
        Preguntas[9]="Adan";
        Preguntas[10]="Ruyman";
        Preguntas[11]="Adan";
        
        
        for (String name : Preguntas) 
        {
            if (histogram.containsKey(name))
                histogram.put(name,histogram.get(name)+1);           
            else
                histogram.put(name,1);       
        }
        
            
        for (Person person : list) {
            if (histogram.containsKey(person.getName()))
                person.setQuestions(histogram.get(person.getName()));
        }
        System.out.println("El histograma es");
        String maxp="";
        int max=0;
        
        for (Person person : list) {
            if (max < person.getQuestions())
            {
                max=person.getQuestions();
                maxp=person.getName();
            }
            System.out.println(person.getName()+" "+ person.getQuestions());
        }
        
        System.out.println("La persona con mas preguntas es "+maxp);
        System.out.println("Su numero de preguntas es "+max);  

        
    }
}
