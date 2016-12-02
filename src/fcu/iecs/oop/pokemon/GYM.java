package fcu.iecs.oop.pokemon;
import java.util.Random;//�פJ�ΥH���ü�


public class GYM {
	
	public static Player fight(Player p1,Player p2){//static�᪺Player�A���j�ǫ��A
		
		Random random=new Random();//���Ͷü�
		int p1_win=0,p2_win=0;//p1�Mp2���ӳ���
		
		for(int i=0;i<3;i++){ 
			PokemonType p1_type=p1.getPokemons()[i].getType();//��Xp1�� Pokemon [] ����i�ӡA�L��PokemonType�O���� 
		 	
			PokemonType p2_type=p2.getPokemons()[i].getType(); 
			
			int p1_cp=p1.getPokemons()[i].getCp();//��Xp1�� Pokemon [] ����i�ӡA�L��cp�O�h��
			
			int p2_cp=p2.getPokemons()[i].getCp(); 
			
			if(p1_type!=p2_type){ 
				if(p2_type==PokemonType.FIRE&&p1_type==PokemonType.GRASS){
					p2_win++; 
				}
				else if(p2_type==PokemonType.GRASS&&p1_type==PokemonType.WATER){
					p2_win++; 
				}
				else if(p2_type==PokemonType.WATER&&p1_type==PokemonType.FIRE){
					p2_win++; 
				}
				else{
					p1_win++; 
				}
			} 
			else{ 
		 		if(p1_cp>p2_cp){
		 			p1_win++; 
		 		}
			 	else if(p1_cp<p2_cp){
			 		p2_win++; 
			 	}
				else{
					int num;
			 		num=random.nextInt(2);//���Ͷü�0�M1 
			 		if(num==1){
			 			p1_win++; 
			 		}
			 		else {
			 			p2_win++; 
			 		}
			 	} 
			} 
		} 
		
		if(p1_win>p2_win && p1_win>=2){ 
			p1.setLevel(p1.getLevel()+1); 
			System.out.println("Winner is \""+p1.getPlayerName()+"\", and his/her level becomes "+p1.getLevel()+"."); 
			return p1; 
		} 
		else { 
			p2.setLevel(p2.getLevel()+1); 
			System.out.println("Winner is \""+p2.getPlayerName()+"\", and his/her level becomes "+p2.getLevel()+"."); 
			return p2; 
		} 

	}

}
