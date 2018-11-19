# netasdemo

JSF konfiürasyonundaki sıkıntı devam ediyor. Anladığım kadarıyla spring bootun kendi konfigürasyonu ile bazı çakışmalar oluyor. Spring boot kullanmadan JSF çalışıyor ama ikisini bir arada kofigüre edemedim. Onun dışındaki görevleri yaptığımı düşünüyorum. JSF çalışmadığı için haliyle diğer kısımları da deneyemeden yaptım. Sonuç olarak sıkıntı nerede çözemedim. Örneğin bir kaynakta şöyle bir konfigürasyon var:

@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        return new ServletRegistrationBean(servlet, "*.jsf");
    }
    
Ama eklediğim jsf dependencylerinde FacesServlet diye bir class yok. dolayısıyla XML şeklinde yapmaya çalıştım o da çalışmadı. Geri dönüş olumlu/olumsuz olsa da konfigürasyon hakkında tavsiyeleriniz ile dönerseniz sevinirim. İyi çalışmalar.
