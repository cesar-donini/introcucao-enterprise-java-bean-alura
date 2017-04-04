package br.com.caelum.livraria.timer;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {

	@Schedule(hour="22",minute="03", second="00")
	void agendar() {
		System.out.println("Serviço a ser agendado");
	}
	
}
