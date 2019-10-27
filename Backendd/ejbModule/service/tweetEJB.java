package service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TweetEntity;

/**
 * Session Bean implementation class tweetEJB
 */
@Stateless
@LocalBean
public class tweetEJB {

	@PersistenceContext
	private EntityManager em;
	
	
    public tweetEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNewTweet(TweetEntity tweetentity)
	{
		System.out.println("*********Add new tweet*******");
		em.persist(tweetentity);
	}
    
    

}
