/*
 * FileName：MsgNews.java 
 * <p>
 * Copyright (c) 2017-2020, <a href="http://www.webcsn.com">hermit (794890569@qq.com)</a>.
 * <p>
 * Licensed under the GNU General Public License, Version 3 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/gpl-3.0.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.wxmp.wxcms.domain;

import lombok.Data;

import java.util.List;

/**
 *
 * @author hermit
 * @version 2.0
 * @date 2018-04-17 10:54:58
 */
@Data
public class MsgNews extends MsgBase {

	private Integer multType;//'1单图文2多图文类',
	private String title;//标题
	private String author;//作者
	private String brief;//简介
	private String description;//描述
	private String picpath;//封面图片
	private String picdir;//封面图片绝对目录
	private Integer showpic;//是否显示图片
	private String url;//图文消息原文链接
	private String fromurl;//外部链接
	private Long baseId;//消息主表id
	private String mediaId; //媒体id
	private String thumbMediaId;//封面图片id
	private Integer newsIndex;//多图文中的第几条

	private Integer opencomment;//是否打开评论，0不打开，1打开
	private Integer fanscancomment;//是否粉丝才可评论，0所有人可评论，1粉丝才可评论

	private String start;
	private String end;
	//一对多
	private List<MsgArticle> articles;

	public Integer getMultType() {
		return multType;
	}

	public void setMultType(Integer multType) {
		this.multType = multType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicpath() {
		return picpath;
	}

	public void setPicpath(String picpath) {
		this.picpath = picpath;
	}

	public String getPicdir() {
		return picdir;
	}

	public void setPicdir(String picdir) {
		this.picdir = picdir;
	}

	public Integer getShowpic() {
		return showpic;
	}

	public void setShowpic(Integer showpic) {
		this.showpic = showpic;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getFromurl() {
		return fromurl;
	}

	public void setFromurl(String fromurl) {
		this.fromurl = fromurl;
	}

	public Long getBaseId() {
		return baseId;
	}

	public void setBaseId(Long baseId) {
		this.baseId = baseId;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public Integer getNewsIndex() {
		return newsIndex;
	}

	public void setNewsIndex(Integer newsIndex) {
		this.newsIndex = newsIndex;
	}

	public Integer getOpencomment() {
		return opencomment;
	}

	public void setOpencomment(Integer opencomment) {
		this.opencomment = opencomment;
	}

	public Integer getFanscancomment() {
		return fanscancomment;
	}

	public void setFanscancomment(Integer fanscancomment) {
		this.fanscancomment = fanscancomment;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public List<MsgArticle> getArticles() {
		return articles;
	}

	public void setArticles(List<MsgArticle> articles) {
		this.articles = articles;
	}
}
