package pl.wszib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wszib.domain.Samochod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SamochodController {

    @RequestMapping("cars1")
    public String iteration1 (Model model) {
            List<Samochod> list = generalList();
            model.addAttribute("list", list);
            return "carsTemplate1";
    }

    @GetMapping("cars")
    public String iteration(Model model) {
        List<Samochod> list = generalList();
        model.addAttribute("list", list);
        return "carsTemplate";



}

    @GetMapping("single")
    public String basic(Model model){
        Samochod samochod1 = new Samochod();
        samochod1.setMarka("Opel");
        samochod1.setModel("Corsa");
        samochod1.setRocznik("2010");
        samochod1.setCena("9000");
        samochod1.setPrzebieg("2500000");
        return "singleTemplate";
    }



private List<Samochod> generalList() {
    List<Samochod> list = new ArrayList<>();

    Samochod samochod1 = new Samochod();
    samochod1.setMarka("Opel");
    samochod1.setModel("Corsa");
    samochod1.setRocznik("2010");
    samochod1.setCena("9000");
    samochod1.setPrzebieg("2500000");
    list.add(samochod1);

    Samochod samochod2 = new Samochod();
    samochod2.setMarka("Skoda");
    samochod2.setModel("Fabia");
    samochod2.setRocznik("2011");
    samochod2.setCena("10000");
    samochod2.setPrzebieg("210000");
    list.add(samochod2);

    Samochod samochod3 = new Samochod();
    samochod3.setMarka("VW");
    samochod3.setModel("Golf");
    samochod3.setRocznik("2005");
    samochod3.setCena("11500");
    samochod3.setPrzebieg("160000");
    list.add(samochod3);

    Samochod samochod4 = new Samochod();
    samochod4.setMarka("Mercedes");
    samochod4.setModel("C class");
    samochod4.setRocznik("2012");
    samochod4.setCena("20000");
    samochod4.setPrzebieg("170000");
    list.add(samochod4);

    Samochod samochod5 = new Samochod();
    samochod5.setMarka("Land Rover");
    samochod5.setModel("Defender");
    samochod5.setRocznik("1999");
    samochod5.setCena("26600");
    samochod5.setPrzebieg("45000");

    Samochod samochod6 = new Samochod();
    samochod6.setMarka("Renault");
    samochod6.setModel("Kangoo");
    samochod6.setRocznik("2009");
    samochod6.setCena("113000");
    samochod6.setPrzebieg("25000");
    list.add(samochod6);

    Samochod samochod7 = new Samochod();
    samochod7.setMarka("Ford");
    samochod7.setModel("Mondeo");
    samochod7.setRocznik("2015");
    samochod7.setCena("50000");
    samochod7.setPrzebieg("7500");
    list.add(samochod7);

    Samochod samochod8 = new Samochod();
    samochod8.setMarka("Citroen");
    samochod8.setModel("C5");
    samochod8.setRocznik("2003");
    samochod8.setCena("116000");
    samochod8.setPrzebieg("250000");
    list.add(samochod8);

    Samochod samochod9 = new Samochod();
    samochod9.setMarka("Ford");
    samochod9.setModel("Transit");
    samochod9.setRocznik("2008");
    samochod9.setCena("17000");
    samochod9.setPrzebieg("169000");
    list.add(samochod9);

    Samochod samochod10 = new Samochod();
    samochod10.setMarka("VW");
    samochod10.setModel("Polo");
    samochod10.setRocznik("2013");
    samochod10.setCena("17000");
    samochod10.setPrzebieg("36000");
    list.add(samochod10);


    return list;
}
}