package model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import twitter4j.conf.ConfigurationBuilder;

@Entity(name = "tweet_tbl")

@ManagedBean(name = "tweetentity")

public class TweetEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	private String tweetBody;
	private Long tweetID;
	private Date timestamp;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getTweetBody() {
		return tweetBody;
	}
	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	public Long getTweetID() {
		return tweetID;
	}
	public void setTweetID(Long tweetID) {
		this.tweetID = tweetID;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    public static void main(String[] args) {

        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);

      
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));

        
        System.out.println(timestamp.getTime());

        
        System.out.println(sdf.format(timestamp));
        
    }
	public static void main1(String[] args) 
	{
		ConfigurationBuilder cf = new ConfigurationBuilder();
		
		cf.setDebugEnabled(true)
		   set.OAuth.ConsumerKey=("YUWo5h7NTR0VmrkREVW3OnBB8");
		   set.OAuth.consumerSecret=("L6q5DddvDFgMSYpCghPTLIIbV34Yc18ZKn9mrlL4DpvDtTK3NV");
		   set.OAuth.accessToken=("1102499153387630594-EiaPZh8oVpQpu1tpD9WT6tQP9a6dig");
		   set.OAoauth.accessTokenSecret=("zNa5mQGyHfTxccpysgqxHmqXKcqH2QFj84k13VwrTvTIC");
		   
		   
	}
	


}
