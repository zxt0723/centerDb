package com.haibei.controller.webservice;


import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.haibei.pojo.zichan.SSExample;
import com.haibei.pojo.zichan.SSExample.Criteria;
import com.haibei.pojo.zichan.SSLExample;
import com.haibei.pojo.zichan.XQExample;
import com.haibei.service.zichan.SSLService;
import com.haibei.service.zichan.SSService;
import com.haibei.service.zichan.XQService;
import com.haibei.util.token.TokenTools;


@Controller
@RequestMapping("/webservice")
public class BuildingController
{
  @Resource
  XQService xQService;
  @Resource
  SSLService sSLService;
  @Resource
  SSService sSService;
  /* function:²éÑ¯Ð£Çø
   * param:sysId
   * param:stamp
   * param:token
   * param:xqNo Ð£Çø±àºÅ
   */
  @RequestMapping(value = "/440101", method = RequestMethod.GET, headers = "Accept=application/json")
  @ResponseBody
  public Map<String,Object>  queryXq(@RequestParam(value="sysId",required=false) String sysId,
		  @RequestParam(value = "stamp", required = false) String stamp,
		  @RequestParam(value = "token", required = false) String token,
		  @RequestParam(value="xqNo", required = false) Long xqNo)
  { 
	  Map<String, Object> rtn = new HashMap<String, Object>();
	  //ÒÔÏÂ´úÂëÓÃÀ¹½ØÆ÷ÊµÏÖ
	/*	String[] param = { sysId, xqNo.toString(), stamp };
		Map<String, Object> c = TokenTools.checkSHA1Token(SYS, sysId, param, Long.parseLong(stamp), token);
		if ((Integer) c.get("code") != 0) {
			rtn.put("code", c.get("code"));
			rtn.put("msg", c.get("msg"));
			return rtn;
		}*/
	  rtn.put("code","200");
	  rtn.put("msg","success");
	 
	  if(xqNo==null||xqNo.equals(0)){
		  rtn.put("data",xQService.selectByExample(null)); 
	  }else{
		  XQExample  xQExample=new XQExample();
		  xQExample.createCriteria().andWidEqualTo(xqNo);
		  rtn.put("data",xQService.selectByExample(xQExample));
	  }
	  
	  return rtn;
  }
  
  /* ²éÑ¯ËÞÉáÂ¥
   * param:sysId
   * param:stamp
   * param:token
   * param:xqNo Ð£Çø±àºÅ
   * param:sslNo ËÞÉáÂ¥±àºÅ
   */
  @RequestMapping(value = "/440102", method = RequestMethod.GET, headers = "Accept=application/json")
  @ResponseBody
  public Map<String,Object>  querySSL(@RequestParam(value="sysId",required=false) String sysId,
		  @RequestParam(value = "stamp", required = false) String stamp,
		  @RequestParam(value = "token", required = false) String token,
		  @RequestParam(value="xqNo", required = false) Long xqNo,
		  @RequestParam(value="sslNo", required = false) Long sslNo
		  )
  { 
	  Map<String, Object> rtn = new HashMap<String, Object>();
	  rtn.put("code","200");
	  rtn.put("msg","success");
	  SSLExample  sSlExample=new SSLExample();
	  if(xqNo!=null&&!xqNo.equals(0)){  //Ð£Çø±àºÅ
		  sSlExample.createCriteria().andPwidEqualTo(xqNo);
		  
	  }else if(sslNo!=null&&!sslNo.equals(0)){  //ËÞÉáÂ¥±àºÅ
		  sSlExample.createCriteria().andWidEqualTo(sslNo);
		  
	  }
	  rtn.put("data",sSLService.selectByExample(sSlExample)); 
	  return rtn;
  }
 
  /* ²éÑ¯ËÞÉá
   * param:sysId
   * param:stamp
   * param:token
   * param:xqNo Ð£Çø±àºÅ
   * param:sslNo ËÞÉáÂ¥±àºÅ
   */
  @RequestMapping(value = "/440103", method = RequestMethod.GET, headers = "Accept=application/json")
  @ResponseBody
  public Map<String,Object>  querySS(@RequestParam(value="sysId",required=false) String sysId,
		  @RequestParam(value = "stamp", required = false) String stamp,
		  @RequestParam(value = "token", required = false) String token,
		  @RequestParam(value="sslNo", required = false) Long sslNo,
		  @RequestParam(value="lc", required = false) Short lc,
		  @RequestParam(value="ssNo", required = false) Long ssNo
		  )
  { 
	  Map<String, Object> rtn = new HashMap<String, Object>();
	  rtn.put("code","200");
	  rtn.put("msg","success");
	  SSExample  sSExample=new SSExample();
	  Criteria criteria=sSExample.createCriteria();
	  if(sslNo!=null&&!sslNo.equals(0)){  //Ð£Çø±àºÅ
		  criteria.andPwidEqualTo(sslNo);
	  }
	  if(lc!=null){  //ËÞÉáÂ¥±àºÅ
		  criteria.andLcEqualTo(lc);
	  }
	  if(ssNo!=null&&!ssNo.equals(0)){
		  criteria.andWidEqualTo(ssNo);
	  }
	  rtn.put("data",sSService.selectByExample(sSExample)); 
	  return rtn;
  }
}
