package com.project.T.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.T.Model.Truck;
import com.project.T.Repo.TruckConn;

class TruckOverload extends Exception
{
	public TruckOverload(String msg) 
	{
		super(msg);
	}
}

@Controller
public class TruckControl {

	@Autowired
	private TruckConn TC;
	
	@RequestMapping("/")
	public String isLand()
	{
		return "add.jsp";
	}
	@RequestMapping("/insert")
	public String isInsert(@ModelAttribute Truck T,Model m)
	{
		if(T.getCapacity()<T.getLoadCapacity())
		{
			try
			{
				throw new TruckOverload("Truck Overload..!");
			}
			catch(Exception e)
			{
				m.addAttribute("msg", e.getMessage());
			}
		}
		else
		{
			if(TC!=null)
			{
				TC.save(T);
				m.addAttribute("msg", "Data inserted successfully..!");
			}
			else
			{
				m.addAttribute("msg", "Data not inserted successfully..!");
			}
		}
		return "/";
	}
	@RequestMapping("/fetch")
	public String isfetch(Model m)
	{
		List<Truck> lt = TC.findAll();
		m.addAttribute("Truck", lt);
		return "fetch.jsp";
	}
		
}
