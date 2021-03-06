/*
 * FileName：MediaFileService.java 
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
package com.wxmp.wxcms.service;

import com.wxmp.wxcms.domain.MediaFiles;

import java.util.List;

/**
 * 语音和视频逻辑层
 * @author nigulading
 *
 */
public interface MediaFileService {

	/**
	 *  分页
	 * @param entity
	 * @return
	 */
	public List<MediaFiles> getMediaListByPage(MediaFiles entity);
	/**
	 * 添加
	 * @param entity
	 */
	public void add(MediaFiles entity);
	
	/**
	 * 删除
	 * @param mediaId
	 */
	public void deleteByMediaId(String mediaId);
	/**
	 * 获取单条数据
	 * @param mediaId
	 * @return
	 */
	public MediaFiles getFileByMediaId(String mediaId);
}
