/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.ProdukService;

/**
 *
 * @author LabGSG
 */
public class ProdukController extends SimpleFormController {
    ProdukService ps;
    public void setProdukService(ProdukService ps){
        this.ps = ps;
    }
    public ProdukController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Produk.class);
        setCommandName("produk");
        setSuccessView("produkView");
        setFormView("formView");
    }
    

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
     @Override
     protected ModelAndView onSubmit(
     HttpServletRequest request, 
     HttpServletResponse response, 
     Object command, 
     BindException errors) throws Exception {
         Produk pd = (Produk) command;
         ModelAndView mv = new ModelAndView(getSuccessView());
         mv.addObject("tampilData", ps.tampilKode(pd.getKode()+ps.tampilNama(pd.getNama())+ps.tampilHarga(pd.getHarga())+ps.tampilStok(pd.getStok())) );
         return mv;
     }
     
     
}
