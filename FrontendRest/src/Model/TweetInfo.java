package Model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

import model.TweetEntity;

@ManagedBean(name ="tweetinfo")
@SessionScoped

@Path("/MyTweetInfo")
@ApplicationPath("/resources")
public class  TweetInfo extends Application {
	
	private String tweetBody;
	private Long tweetID;
	private Date timestamp;
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
	
	public TweetEntity getEntity() 
	{
		TweetEntity tweetentity = new TweetEntity();
		
		tweetentity.setTweetBody(tweetBody);
		tweetentity.setTweetID(tweetID);
		tweetentity.setTimestamp(timestamp);
		
		return tweetentity;
	}
	

}
