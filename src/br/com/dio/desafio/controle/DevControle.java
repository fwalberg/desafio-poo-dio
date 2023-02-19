package br.com.dio.desafio.controle;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;

import java.util.Optional;

public class DevControle {

    public  void inscreverBootCamp(Dev dev, Bootcamp bootcamp) {
        dev.getConteudosInscritos().addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(dev);
    }

    public void progredir(Dev dev) {
        Optional<Conteudo> conteudo = dev.getConteudosInscritos().stream().findFirst();
        if(conteudo.isPresent()) {
            dev.getConteudosConcluidos().add(conteudo.get());
            dev.getConteudosInscritos().remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum contéudo");
        }
    }

    public double calcularTotalXp(Dev dev) {
        return dev.getConteudosConcluidos().stream()
                .mapToDouble(Conteudo::calcularXp).sum();
    }


}
