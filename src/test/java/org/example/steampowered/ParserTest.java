package org.example.steampowered;


import org.junit.jupiter.api.BeforeAll;
import org.example.steampowered.service.ParserService;

public class ParserTest {
    
    private static String userId = "76561198046659335";
    private static ParserService parser;    
    
   @BeforeAll
   public static void setUp(){
    parser = new ParserService();
   }

    // @Test
    // void testGetUserLibrary() {
    //     ArrayList<String> appIds = new ArrayList<>(parser.getUserLibraryIds(userId));
    //     // Using Paul's library.  There should be 295 apps
    //     Assertions.assertEquals(295, appIds.size());
    // }

    // @Test
    // void testGetGameDetails() {
    //     parser.getGameDetails(userId);
    // }
}
