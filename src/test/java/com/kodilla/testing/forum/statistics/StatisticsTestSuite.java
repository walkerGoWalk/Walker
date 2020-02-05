package com.kodilla.testing.forum.statistics;
import org.junit.*;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private static int testCounter = 0;
    Statistics statistics;
    ArrayList<String> userNamesList;
    CalculatingStatistics сalculatingStatistics ;
    ;

    @BeforeClass
    public static void beforeAllTests() {

        System.out.println("Beginning");
    }

    @AfterClass
    public static void afterAllTests() {

        System.out.println("Finish");
    }

    @Before
    public void beforeGiven(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        statistics = mock(Statistics.class);
        userNamesList = new ArrayList<String>();
        сalculatingStatistics = new CalculatingStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsZero(){
        //Given
        when(statistics.usersNames()).thenReturn(userNamesList);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(0);

        //When
        сalculatingStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(0, сalculatingStatistics.getUsersQuantity());
        Assert.assertEquals(0, сalculatingStatistics.getPostsQuantity());
        Assert.assertEquals(0, сalculatingStatistics.getСommentsQuantity());
        Assert.assertEquals(0, сalculatingStatistics.getPostsPerUser(), 0.0);
        Assert.assertEquals(0, сalculatingStatistics.getCommentsPerUser(), 0.0);
        Assert.assertEquals(0, сalculatingStatistics.getCommentsPerPost(), 0.0);
        сalculatingStatistics.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsMorePostsThenComments(){
        //Given
        for(int i=0; i<100; i++){
            userNamesList.add("User " + i);
        }
        when(statistics.usersNames()).thenReturn(userNamesList);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(700);

        //When
        сalculatingStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(100, сalculatingStatistics.getUsersQuantity());
        Assert.assertEquals(1000, сalculatingStatistics.getPostsQuantity());
        Assert.assertEquals(700, сalculatingStatistics.getСommentsQuantity());
        Assert.assertEquals(10, сalculatingStatistics.getPostsPerUser(), 0.0);
        Assert.assertEquals(7, сalculatingStatistics.getCommentsPerUser(), 0.0);
        Assert.assertEquals(0.7, сalculatingStatistics.getCommentsPerPost(), 0.0);
    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThenPosts(){
        //Given
        for(int i=0; i<100; i++){
            userNamesList.add("User " + i);
        }

        when(statistics.usersNames()).thenReturn(userNamesList);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(1100);

        //When
        сalculatingStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(100, сalculatingStatistics.getUsersQuantity());
        Assert.assertEquals(1000, сalculatingStatistics.getPostsQuantity());
        Assert.assertEquals(1100, сalculatingStatistics.getСommentsQuantity());
        Assert.assertEquals(10, сalculatingStatistics.getPostsPerUser(), 0.0);
        Assert.assertEquals(11, сalculatingStatistics.getCommentsPerUser(), 0.0);
        Assert.assertEquals(1.1, сalculatingStatistics.getCommentsPerPost(), 0.0);
    }
    @Test
    public void testCalculateAdvStatisticsZeroComments() {
        //Given
        for (int i = 0; i < 100; i++) {
            userNamesList.add("User " + i);
        }
        when(statistics.usersNames()).thenReturn(userNamesList);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);

        //When
        сalculatingStatistics.calculateAdvStatistics(statistics);

        //Then
        Assert.assertEquals(100, сalculatingStatistics.getUsersQuantity());
        Assert.assertEquals(1000, сalculatingStatistics.getPostsQuantity());
        Assert.assertEquals(0, сalculatingStatistics.getСommentsQuantity());
        Assert.assertEquals(10, сalculatingStatistics.getPostsPerUser(), 0.0);
        Assert.assertEquals(0, сalculatingStatistics.getCommentsPerUser(), 0.0);
        Assert.assertEquals(0, сalculatingStatistics.getCommentsPerPost(), 0.0);
    }
}
