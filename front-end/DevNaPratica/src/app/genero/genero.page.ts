import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServerService } from '../server.service';
import { Genero } from '../classes';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-genero',
  templateUrl: './genero.page.html',
  styleUrls: ['./genero.page.scss'],
})
export class GeneroPage implements OnInit {

  genero: Genero;
  constructor(public provider: ServerService, public activatedRoute: ActivatedRoute, public navCtrl: NavController) {
    this.genero = new Genero()
  }

  ngOnInit() {
  }

  ionViewDidEnter() {
    let id = this.activatedRoute.snapshot.paramMap.get("id")    
    if (id != "0") {
      this.provider.GetGenero(id).then(retonno => {
        this.genero = retonno
        console.log(this.genero)
      }).catch(erro => {
        alert("Erro ao cerregar genero:" + erro)
      })
    }
  }

  salvar() {
    this.provider.SalvarGenero(this.genero).then(retonno => {
      alert("genero salvo com sucesso!")
      this.navCtrl.navigateForward("");
    }).catch(erro => {
      alert("Erro ao salvar genero:" + erro)
    })

  }
  Excluir() {
    this.provider.DeleleGenero(this.genero.id).then(retonno => {
      alert("genero excluido!")
      this.navCtrl.navigateForward("");
    }).catch(erro => {
      alert("Erro ao excluir genero:" + erro)
    })
  }

}
