package com.Lucas.ManyToManyCocina.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Lucas.ManyToManyCocina.Model.DaoIngrediente;
import com.Lucas.ManyToManyCocina.Model.DaoReceta;
import com.Lucas.ManyToManyCocina.Model.DaoReceting;
import com.Lucas.ManyToManyCocina.Model.Formulario;
import com.Lucas.ManyToManyCocina.Model.Ingrediente;
import com.Lucas.ManyToManyCocina.Model.Receta;
import com.Lucas.ManyToManyCocina.Model.Receting;

@Controller
public class MainController {
		@Autowired
		private DaoIngrediente daoIngrediente;
		@Autowired
		private DaoReceta daoReceta;
		@Autowired
		private DaoReceting daoReceting;
		
		private Formulario formulario;
		
		private String[] unidades={"Kilogramos", "Gramos", "Miligramo"};
		
	@RequestMapping(value="/",method=RequestMethod.GET)
	 public ModelAndView home() {
		 ModelAndView modelAndView = new ModelAndView("home");	 
		 modelAndView.addObject("recetas", daoReceta.findAll());
		 modelAndView.addObject("ingredientes", daoIngrediente.findAll());
		 modelAndView.addObject("receta", new Receta());
		 modelAndView.addObject("ingrediente", new Ingrediente());
		 modelAndView.addObject("receting", new Receting());
		 modelAndView.addObject("receting2", new Receting());
			modelAndView.addObject("receting3", new Receting());
			modelAndView.addObject("unidades", unidades);
		 return modelAndView;
	 }
//	@RequestMapping(value="/",method=RequestMethod.GET)
//	 public ModelAndView home() {
//		 ModelAndView modelAndView = new ModelAndView("home2");	 
//		 modelAndView.addObject("recetas", daoReceta.findAll());
//		 modelAndView.addObject("ingredientes", daoIngrediente.findAll());
//		 modelAndView.addObject("receta", new Receta());
//		 modelAndView.addObject("formulario", new Formulario());
//			modelAndView.addObject("unidades", unidades);
//		 return modelAndView;
//	 }
//	 @RequestMapping(value="alta",method = RequestMethod.POST)
//		public ModelAndView alta(@ModelAttribute Receta recetaRecibida,
//								@ModelAttribute Formulario formulario) {
//			ModelAndView modelAndView = new ModelAndView("redirect:/");
//			daoReceta.save(recetaRecibida);
//			daoReceting.save(formulario.getReceting1());
//			daoReceting.save(formulario.getReceting2());
//			formulario.getReceting1().setReceta(recetaRecibida);
//			formulario.getReceting2().setReceta(recetaRecibida);
//			daoReceting.save(formulario.getReceting1());
//			daoReceting.save(formulario.getReceting2());
//			modelAndView.addObject("recetas", daoReceta.findAll());
//			modelAndView.addObject("ingredientes", daoIngrediente.findAll());
//			modelAndView.addObject("receta", new Receta());
//			modelAndView.addObject("ingrediente", new Ingrediente());
//			modelAndView.addObject("receting", new Receting());
//			modelAndView.addObject("receting2", new Receting());
//			modelAndView.addObject("receting3", new Receting());
//			return modelAndView;
//		}
	 @RequestMapping(value="alta",method = RequestMethod.POST)
		public ModelAndView alta(@ModelAttribute Receting recetingRecibido,
								@ModelAttribute Receta recetaRecibida,
								@ModelAttribute Ingrediente ingredienteRecibido,
								@ModelAttribute("receting2") Receting recetingRecibido2) {
			ModelAndView modelAndView = new ModelAndView("home");
			daoReceta.save(recetaRecibida);
			
			daoReceting.save(recetingRecibido);
			daoReceting.save(recetingRecibido2);
			recetingRecibido.setReceta(recetaRecibida);	
			recetingRecibido.setIngrediente(ingredienteRecibido);
			daoReceting.save(recetingRecibido);
			
			daoReceting.save(recetingRecibido2);
			recetingRecibido2.setReceta(recetaRecibida);
			recetingRecibido2.setCantidad(recetingRecibido2.getCantidad());
			daoReceting.save(recetingRecibido2);
			modelAndView.addObject("recetas", daoReceta.findAll());
			modelAndView.addObject("ingredientes", daoIngrediente.findAll());
			modelAndView.addObject("receta", new Receta());
			modelAndView.addObject("ingrediente", new Ingrediente());
			modelAndView.addObject("receting", new Receting());
			modelAndView.addObject("receting2", new Receting());
			modelAndView.addObject("receting3", new Receting());
			return modelAndView;
		}
	 
	 
	 
	public MainController() {
		// TODO Auto-generated constructor stub
	}

}
