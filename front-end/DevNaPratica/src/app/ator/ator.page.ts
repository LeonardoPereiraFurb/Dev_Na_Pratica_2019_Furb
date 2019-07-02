import { Component, OnInit } from '@angular/core';
import { Ator } from '../classes';
import { ActivatedRoute } from '@angular/router';
import { ServerService } from '../server.service';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-ator',
  templateUrl: './ator.page.html',
  styleUrls: ['./ator.page.scss'],
})
export class AtorPage implements OnInit {

  ator: Ator;
  constructor(public provider: ServerService, public activatedRoute: ActivatedRoute, public navctrl: NavController) {
    this.ator = new Ator();
  }

  ngOnInit() {
  }

  ionViewDidEnter() {
    let id = this.activatedRoute.snapshot.paramMap.get("id")
    if (id != "0") {
      this.provider.GetAtor(id).then(retonno => {
        this.ator = retonno
      }).catch(erro => {
        alert("Erro ao cerregar filme:" + erro)
      })
    }
  }

  salvar() {
    this.provider.SalvarFilme(this.ator).then(retonno => {
      alert("Ator salvo com sucesso!")
      this.navctrl.navigateForward("")
    }).catch(erro => {
      alert("Erro ao salvar ator:" + erro)
    })
  }
  Excluir() {
    this.provider.DeleleAtor(this.ator.id).then(retonno => {
      alert("Ator excluído com sucesso!")
      this.navctrl.navigateForward("")
    }).catch(erro => {
      alert("Erro ao excluir ator:" + erro)
    })
  }

}
