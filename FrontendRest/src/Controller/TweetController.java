package Controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import Model.TweetInfo;
import service.tweetEJB;

@ManagedBean(name = "tweetcontroller")
@SessionScoped

public class TweetController {
	
	@EJB
	tweetEJB tweetservice;
	@ManagedProperty(value="#(tweetinfo)")
	private TweetInfo tweetinfo;

	
	public void addNewTweet()
	{
		System.out.println("is it working");
		tweetservice.addNewTweet(tweetinfo.getEntity());
	}


	public TweetInfo getTweetinfo() {
		return tweetinfo;
	}


	public void setTweetinfo(TweetInfo tweetinfo) {
		this.tweetinfo = tweetinfo;
	}
	
	
}
