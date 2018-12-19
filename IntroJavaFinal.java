/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavafinal;

  import java.util.HashMap ; 
import java.util.Scanner ; 
/**
 *darsow showed me I know a thing or two, but there's still plenty of programming to perpetually learn. 
 * I think this is worth an A
 //I author you deez nuts 
 */

public class IntroJavaFinal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("           Welcome to your game library!\n "
                + "    Please enter a game title, genre, or system search query \n"
                 + "with no abbreviations, capital letters, symbols, or extra spaces \n"
                 + "     and we will find titles best fit to your matching terms!"); 
        Scanner keyboardReader = new Scanner (System.in); 
        
       
        
       HashMap<String, String> game_library = new HashMap<>()   ; 
      
       String mother3 ="Mother 3. RPG. Available on Gameboy Advance. \n  " ; //done
       String earthbound = "Earthbound. RPG. Available on Super Nintendo, Wii U, and 3DS. \n " ; //done
       
        String pokemon = "Pokemon Crystal. RPG. Available on Gameboy Color, Gameboy Advance and 3DS. \n " ; //done
        String pmd2 = "Pokemon Mystery Dungeon: Explorers of Sky. Dungeon Crawler/Roguelike RPG. Playable on any variation of the DS and Wii U. \n "; //done
        
         String sotc = "Shadow of the Colossus. 3D Puzzle Platformer and Action Adventure. On PS2, PS3, and PS4. \n "; //done
       String ico = "Ico. 3D Puzzle Platformer and Action Adventure. On PS2 and PS3. \n  " ; //done
       
       String spyro = "The Legend of Spyro: The Eternal Night. 3D Beat 'em up Platformer. On PS2 and Wii. \n "; //done
       String mm = "The Legend of Zelda: Majora's Mask. 3D Puzzle Platformer and Action Adventure. On Nintendo 64, GameCube, and Wii. \n "; //done
       
       String bfbb = "Spongebob Squarepants: Battle for Bikini Bottom. 3D Platformer Collectathon. On PS2, GameCube, Xbox. \n " ; //done
       String smg2 = "Super Mario Galaxy 2. 3D Platformer Collectathon. Only on the Wii. \n ";//done 
       String nsmb = "New Super Mario Bros. 2D Sidescroller and Platformer. Playable on any variation of the DS. \n "; //done
       
       //mario kart double dash ha gottem
       String kart = "Mario Kart Wii. Online Multiplayer Racing game. Only on the Wii. \n "; //done
       String ssbb = "Super Smash Bros. Brawl. Online Multiplayer Party Fighting game. Only on the Wii. \n   "; //done
       
       String tf2 = "Team Fortress 2. Team-based Online Multiplayer FPS. Only on the PC. \n  "; //done 
        String doom = "The Ultimate Doom. Sci-fi FPS. This runs on almost anything. Originally released for PC. \n  "; //done
      
       String soma = "SOMA. Sci-fi horror. Available on PS4 and PC. \n "; //done
        
        //organized by series, then by genre. I put spaces between each new section
        // this took far too long to type out, and had way too much manually done. 
        //In streaming and asking fellow programmers, I learned of something called an array
        // that is far better for this, as it cuts out a lot of typing and still gives back desired preset outputs for the user input
        // this type of system would not work if you were to do this for even a couple hundred games
        // there are much less tedious and far more optimal ways to do this, I just didn't know about them
        //multiple search results are possible. \n is used so that each result recieves it's own discription line
        
        
        game_library.put("mother", mother3 + earthbound ) ; 
        game_library.put("earthbound" , mother3 + earthbound) ; 
        game_library.put("earth" , mother3 + earthbound) ; 
        game_library.put("bound" , mother3 + earthbound) ; 
        game_library.put("earth bound" , mother3 + earthbound) ; 
        game_library.put("mother 2", earthbound) ; 
        game_library.put("mother 3", mother3);
        game_library.put("earthbound 2", mother3);
     
        game_library.put("crystal", pokemon);
        game_library.put("pokemon crystal", pokemon);
        
        game_library.put("pokemon mystery dungeon explorers of sky", pmd2); 
        game_library.put("pokemon mystery dungeon 2", pmd2);
        game_library.put("pokemon mystery dungeon explorers of", pmd2);
        game_library.put("explorers of sky", pmd2);
        game_library.put("pokemon mystery dungeon", pmd2); 
        game_library.put("pokemon mystery dungeon explorers", pmd2);
        game_library.put("mystery dungeon", pmd2);
        game_library.put("pokemon mystery dungeon", pmd2);
        game_library.put("dungeon", pmd2);
        game_library.put("mystery", pmd2);
        game_library.put("explorers", pmd2); 
        game_library.put("sky", pmd2);
        game_library.put("of sky", pmd2); 
        game_library.put("mystery dungeon explorers", pmd2);
        game_library.put("mystery dungeon explorers of", pmd2); 
        game_library.put("mystery dungeon explorers of sky", pmd2); 
        game_library.put("dungeon explorers", pmd2);
        game_library.put("dungeon explorers of", pmd2);
        game_library.put("dungeon explorers of sky", pmd2); 
        
        
         game_library.put("shadow",sotc + ico );
        game_library.put("shadow of", sotc + ico );
        game_library.put("shadow of the", sotc + ico);
        game_library.put("shadow of the colossus", sotc + ico);
        game_library.put("ico", ico); 
        
        
         game_library.put("spyro", spyro) ; 
        game_library.put("eternal", spyro) ; 
        game_library.put("night", spyro); 
        game_library.put("eternal night", spyro);
        game_library.put("spyro eternal night", spyro);
        game_library.put("the eternal", spyro); 
        game_library.put("the eternal night", spyro); 
        game_library.put("spyro the eternal night", spyro); 
        game_library.put("the legend of spyro", spyro);
        game_library.put("the legend of spyro the", spyro);
        game_library.put("the legend of spyro the eternal", spyro);
        game_library.put("the legend of spyro the eternal night", spyro);
        game_library.put("the legend of spyro eternal", spyro);
        game_library.put("the legend of spyro eternal night", spyro);
        
        
        game_library.put("zelda", mm); 
        game_library.put("majora" , mm) ; 
        game_library.put("majoras" , mm) ; 
        game_library.put("mask" , mm) ; 
        game_library.put("majoras mask" , mm) ; 
        game_library.put("the legend of zelda", mm);
        game_library.put("the legend of zelda:", mm);
        game_library.put("the legend of zelda majora", mm) ; 
        game_library.put("the legend of zelda: majora" , mm) ; 
        game_library.put("the legend of zelda majora's" , mm);
        game_library.put("the legend of zelda: majora's", mm);
        game_library.put("the legend of zelda majora's mask", mm) ; 
        game_library.put("the legend of zelda: majora's mask", mm);
        game_library.put("zelda majora" ,  mm) ;
        game_library.put("zelda majoras", mm) ; 
        game_library.put("zelda majoras mask", mm) ;
     
        
        game_library.put("spongebob squarepants battle for bikini bottom", bfbb);
        game_library.put("spongebob squarepants battle for bikini", bfbb);
        game_library.put("spongebob squarepants battle for", bfbb);
        game_library.put("spongebob squarepants battle", bfbb);
        game_library.put("spongebob squarepants", bfbb);
        game_library.put("battle for bikini bottom", bfbb); 
        game_library.put("spongebob", bfbb); 
        game_library.put("squarepants", bfbb); 
        game_library.put("battle", bfbb);
        game_library.put("bikini bottom", bfbb); 
        game_library.put("bikini", bfbb); 
        game_library.put("bottom", bfbb);
        game_library.put("for bikini bottom", bfbb);
        game_library.put("for bikini", bfbb); 
        game_library.put("battle for bikini", bfbb);
        game_library.put("squarepants battle for bikini bottom", bfbb);
        game_library.put("squarepants battle for bikini", bfbb);
        game_library.put("squarepants battle for", bfbb);
        game_library.put("squarepants battle", bfbb); 
        
        game_library.put("super mario galaxy 2", smg2);
        game_library.put("super mario galaxy", smg2); 
        game_library.put("galaxy", smg2);
        game_library.put("galaxy 2", smg2);
        game_library.put("mario galaxy 2", smg2);
        game_library.put("mario galaxy", smg2);
        
        game_library.put("new super mario brothers", nsmb);
        game_library.put("new super mario bros", nsmb); 
        game_library.put("new super mario", nsmb); 
        game_library.put("super mario bros", nsmb); 
        game_library.put("super mario brothers", nsmb); 
        game_library.put("mario bros", nsmb); 
        game_library.put("mario brothers", nsmb);
        game_library.put("new super", nsmb);
        game_library.put("mario bros", nsmb);
        game_library.put("mario brothers", nsmb); 
        game_library.put("new", nsmb); 
        
      
        game_library.put("mario kart wii", kart);
        game_library.put("mario kart", kart);
        game_library.put("kart wii",kart);
        
        
        game_library.put("super smash bros brawl", ssbb);
        game_library.put("super smash brothers brawl", ssbb);
        game_library.put("super smash bros", ssbb);
        game_library.put("super smash brothers", ssbb);
        game_library.put("brawl", ssbb);
        game_library.put("smash bros brawl", ssbb);
        game_library.put("smash brothers brawl", ssbb);
        game_library.put("smash bros", ssbb);
        game_library.put("smash brothers", ssbb);
        game_library.put("super smash", ssbb);
        game_library.put("smash", ssbb);
      
                
                
        
        game_library.put("doom", doom);
        game_library.put("ultimate doom", doom);
        game_library.put("the ultimate", doom); 
        game_library.put("the ultimate doom", doom);
        
               
        game_library.put("team fortress 2", tf2); 
        game_library.put("team fortress", tf2);
        game_library.put("fortress 2", tf2);
        game_library.put("fortress", tf2); 
        game_library.put("team", tf2); 
        
         game_library.put("soma", soma);

        
       game_library.put("2", tf2 + pmd2 + smg2 + earthbound + mother3);
       game_library.put("pokemon", pmd2 + pokemon);
       game_library.put("mario", smg2 + nsmb + kart); 
       game_library.put("super", ssbb + nsmb + smg2);
       game_library.put("super mario", smg2 + nsmb);
         game_library.put("the" , mm + doom + spyro );
        game_library.put("legend", mm + spyro); 
        game_library.put("the legend", mm + spyro); 
        game_library.put("the legend of", mm + spyro); 
        game_library.put("legend of", mm + spyro) ; 
        game_library.put("of", mm + spyro + bfbb + sotc + pmd2); 
        game_library.put("for", bfbb + tf2);
        game_library.put("bros", nsmb + ssbb);
        game_library.put("brothers", nsmb + ssbb); 
       
        
        //genres split by category
        game_library.put("horror", soma); 
        game_library.put("scary", soma); 
        
        game_library.put("scifi", soma + doom); 
        game_library.put("science fiction", soma + doom);
        game_library.put("sci fi", soma + doom);
        game_library.put("science", soma + doom);
        game_library.put("fiction", soma + doom);
        
        game_library.put("fps", tf2 + doom); 
        game_library.put("first person shooter", tf2 + doom);
        game_library.put("first person", tf2 + doom);
        game_library.put("shooter", tf2 + doom); 
        game_library.put("person shooter", tf2 + doom); 
        game_library.put("first", tf2 + doom); 
        game_library.put("person", tf2 + doom); 
        
        
        game_library.put("puzzle platformer", sotc + ico + mm);
        game_library.put("puzzle", sotc + ico + mm);
        game_library.put("action adventure", sotc + ico + mm); 
        game_library.put("action adventure puzzle platformer", sotc + ico + mm);
        game_library.put("3d puzzle platformer action adventure", sotc + ico + mm);
        game_library.put("3d puzzle platformer", sotc + ico + mm);
        game_library.put("3d action adventure", sotc + ico + mm);
        game_library.put("3d puzzle", sotc + ico + mm);
        game_library.put("action", sotc + ico + mm);
        game_library.put("adventure", sotc + ico + mm);
        game_library.put("3d action adventure", sotc + ico + mm);
        game_library.put("3d action", sotc + ico + mm);
        game_library.put("3d adventure", sotc + ico + mm);
        game_library.put("action adventure platformer", sotc + ico + mm);
        game_library.put("adventure platformer", sotc + ico + mm);
        game_library.put("action platformer", sotc + ico + mm);
        
        
        game_library.put("fighting", ssbb);
        game_library.put("party", ssbb);
        
        game_library.put("racing", kart);
        
        game_library.put("online multiplayer", tf2 + ssbb + kart);
        game_library.put("online", tf2 + ssbb + kart);
        game_library.put("multiplayer", tf2 + ssbb + kart);
        
        game_library.put("platformer", nsmb + smg2 + sotc + ico + mm + spyro + bfbb);
        game_library.put("3d platformer", smg2 + sotc + ico + mm + spyro + bfbb);
        game_library.put("3d", smg2 + sotc + ico + mm + spyro + bfbb);
        game_library.put("2d platformer", nsmb); 
        game_library.put("2d", nsmb);
        game_library.put("sidescroller", nsmb);
        game_library.put("2d sidescroller", nsmb);
        
        game_library.put("beat em up", spyro); 
        game_library.put("beatemup", spyro);
       
        game_library.put("collectathon", bfbb + smg2);
        game_library.put("3d platformer collectathon", bfbb + smg2);
        game_library.put("platformer collectathon", bfbb + smg2);
        game_library.put("3d collectathon", bfbb + smg2);
        
        game_library.put("dungeon crawler", pmd2);
        game_library.put("roguelike", pmd2);
        game_library.put("rpg", earthbound + mother3 + pokemon + pmd2);
        game_library.put("role playing game", earthbound + mother3 + pokemon + pmd2);
        game_library.put("role playing", earthbound + mother3 + pokemon + pmd2);
        
        
        //systems the titles are available on
        game_library.put("wii", ssbb + smg2 + kart + mm + spyro);
        game_library.put("playstation", soma + sotc + ico + spyro + bfbb);
        game_library.put("ps", soma + sotc + ico + spyro + bfbb);
        game_library.put("ps2", sotc + ico + spyro + bfbb);
        game_library.put("playstation 2", sotc + ico + spyro + bfbb);
        game_library.put("playstation 3", sotc + ico + doom);
        game_library.put("ps3", sotc + ico + doom);
        game_library.put("ds", pmd2 + nsmb);
        game_library.put("3ds", pmd2 + nsmb + earthbound + pokemon);
        game_library.put("pc", soma + tf2 + doom); 
        game_library.put("personal computer", soma + tf2 + doom);
        game_library.put("computer", soma + tf2 + doom);
        game_library.put("ps4", soma);
        game_library.put("playstation 4", soma);
        game_library.put("wii u", pmd2 + earthbound);
        game_library.put("wiiu", pmd2 + earthbound);
        game_library.put("gameboy advance", pokemon + mother3 + doom);
        game_library.put("gba", pokemon + mother3 + doom);
        game_library.put("gameboy color", pokemon);
        game_library.put("super nintendo", earthbound);
        game_library.put("gamecube", mm + bfbb);
        game_library.put("xbox", bfbb + doom);
        game_library.put("nintendo 64", mm);
        game_library.put("n64", mm);
        
        
        
        
        game_library.put("sans", "Ness"); 
        game_library.put("ness", "Sans"); //this is just an inside joke that sans is ness lmao
        
        
        
        
        
        String gameDesired =null;
        boolean valid = false;
   
      
        // this while loop keeps it so the system always begins by asking for user input
        // if there aren't any search results, valid becomes true, and the process is repeated
        while(!valid)
        {
        	String userInput = keyboardReader.nextLine();
        	gameDesired = game_library.get(userInput) ; 
        	if(gameDesired!=null){valid = true;}
			else{System.out.println("Query did not match any searches, try again");}
        }
        keyboardReader.close();
        System.out.println(gameDesired);
  
    }
    
}


