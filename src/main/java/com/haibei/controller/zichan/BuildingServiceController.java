package com.haibei.controller.zichan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.haibei.pojo.zichan.SS;
import com.haibei.pojo.zichan.SSL;
import com.haibei.pojo.zichan.XQ;
import com.haibei.service.zichan.SSLService;
import com.haibei.service.zichan.SSService;
import com.haibei.service.zichan.XQService;

@Controller
@RequestMapping("/building")
public class BuildingServiceController {
	@Resource
	XQService xQservice;
	@Resource
	SSLService sSLservice;
	@Resource
	SSService sSservice;

	// 绑定变量名字和属性，参数封装进类
	@InitBinder("xq")
	public void initBinderXq(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("xq.");
	}
	@InitBinder("ssl")
	public void initBinderSsl(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("ssl.");
	}
	@InitBinder("ss")
	public void initBinderSs(WebDataBinder binder) {
		binder.setFieldDefaultPrefix("ss.");
	}

	/*
	 * 校区管理
	 */
	@RequestMapping(value = "/schoolArea", method = RequestMethod.GET)
	public String schoolAreaList(ModelMap model) {

		// List<XQ> xqList=xQservice.selectByExample(null);
		model.put("xqList", xQservice.selectByExample(null));
		return "building/schoolArea/list";
	}

	/*
	 * 校区删除
	 */
	@RequestMapping(value = "/schoolArea/del", method = RequestMethod.GET)
	public String schoolAreaDel(@RequestParam(value = "id") long id, ModelMap model) {
		// xQservice.deleteByPrimaryKey(id);

		return "building/schoolArea/del";
	}

	/*
	 * 校区添加编辑
	 */
	@RequestMapping(value = "/schoolArea/edit", method = RequestMethod.GET)
	public String schoolAreaEdit(@RequestParam(value = "id", required = false) Long id, ModelMap model) {
		XQ xq;
		if (id == null) {
			xq = new XQ();
		} else {
			xq = this.xQservice.selectByPrimaryKey(id);
		}
		model.put("xq", xq);

		return "building/schoolArea/edit";
	}

	/*
	 * 校区保存
	 */
	@RequestMapping(value = "/schoolArea/save", method = RequestMethod.POST)
	public String schoolAreaSave(@ModelAttribute("xq") XQ xq, ModelMap model) {
		// xQservice.deleteByPrimaryKey(id);
		// System.out.println(xq.getXqmc());
		if (xq.getWid() == null || xq.getWid().equals(0)) {
			this.xQservice.insertSelective(xq);
		} else {
			this.xQservice.updateByPrimaryKeySelective(xq);
		}
		return "building/schoolArea/save";
	}

	
	/*
	 * 宿舍楼管理
	 */
	@RequestMapping(value = "/dormBuilding", method = RequestMethod.GET)
	public String dormBuildingList(ModelMap model) {

		// List<XQ> xqList=xQservice.selectByExample(null);
		model.put("list", sSLservice.selectByExample(null));
		return "building/dormBuilding/list";
	}

	/*
	 * 宿舍楼删除
	 */
	@RequestMapping(value = "/dormBuilding/del", method = RequestMethod.GET)
	public String dormBuildingDel(@RequestParam(value = "id") long id, ModelMap model) {
		// xQservice.deleteByPrimaryKey(id);

		return "building/dormBuilding/del";
	}

	/*
	 * 宿舍楼添加编辑
	 */
	@RequestMapping(value = "/dormBuilding/edit", method = RequestMethod.GET)
	public String dormBuildingEdit(@RequestParam(value = "id", required = false) Long id, ModelMap model) {
		SSL ssl;
		if (id == null) {
			ssl = new SSL();
		} else {
			ssl = this.sSLservice.selectByPrimaryKey(id);
		}
		model.put("ssl", ssl);

		return "building/dormBuilding/edit";
	}

	/*
	 * 宿舍楼保存
	 */
	@RequestMapping(value = "/dormBuilding/save", method = RequestMethod.POST)
	public String dormBuildingSave(@ModelAttribute("ssl") SSL ssl, ModelMap model) {
		// xQservice.deleteByPrimaryKey(id);
		// System.out.println(xq.getXqmc());
		if (ssl.getWid() == null || ssl.getWid().equals(0)) {
			this.sSLservice.insertSelective(ssl);
		} else {
			this.sSLservice.updateByPrimaryKeySelective(ssl);
		}
		return "building/dormBuilding/save";
	}
	
	
	
	/*
	 * 宿舍管理
	 */
	@RequestMapping(value = "/dorm", method = RequestMethod.GET)
	public String dormList(ModelMap model) {

		// List<XQ> xqList=xQservice.selectByExample(null);
		model.put("list", sSservice.selectByExample(null));
		return "building/dorm/list";
	}

	/*
	 * 宿舍删除
	 */
	@RequestMapping(value = "/dorm/del", method = RequestMethod.GET)
	public String dormDel(@RequestParam(value = "id") long id, ModelMap model) {
		// xQservice.deleteByPrimaryKey(id);

		return "building/dorm/del";
	}

	/*
	 * 宿舍添加编辑
	 */
	@RequestMapping(value = "/dorm/edit", method = RequestMethod.GET)
	public String dormEdit(@RequestParam(value = "id", required = false) Long id, ModelMap model) {
		SS ss;
		if (id == null) {
			ss = new SS();
		} else {
			ss = this.sSservice.selectByPrimaryKey(id);
		}
		model.put("ss", ss);

		return "building/dorm/edit";
	}

	/*
	 * 宿舍保存
	 */
	@RequestMapping(value = "/dorm/save", method = RequestMethod.POST)
	public String dormSave(@ModelAttribute("ss") SS ss, ModelMap model) {
		// xQservice.deleteByPrimaryKey(id);
		// System.out.println(xq.getXqmc());
		if (ss.getWid() == null || ss.getWid().equals(0)) {
			this.sSservice.insertSelective(ss);
		} else {
			this.sSservice.updateByPrimaryKeySelective(ss);
		}
		return "building/dorm/save";
	}

	


}
