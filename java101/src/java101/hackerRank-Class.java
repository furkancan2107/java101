import java.util.*;
class Sports{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
 void getNumberOfTeamMembers(){
     System.out.println("Each team has 11 players in Soccer Class");
 }
 
 public static void main(String[] args){
     Sports sports=new Sports();
     Soccer soccer=new Soccer();
     sports.getName();
     sports.getNumberOfTeamMembers();
     soccer.getName();
     soccer.getNumberOfTeamMembers();
 }
    // Write your overridden getNumberOfTeamMembers method here

}
