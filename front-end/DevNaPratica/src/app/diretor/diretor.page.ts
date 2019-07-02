import { Component, OnInit } from '@angular/core';
import { Diretor } from '../classes';
import { ServerService } from '../server.service';
import { ActivatedRoute } from '@angular/router';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-diretor',
  templateUrl: './diretor.page.html',
  styleUrls: ['./diretor.page.scss'],
})
export class DiretorPage implements OnInit {

  diretor: Diretor;
  constructor(public provider: ServerService, public activatedRoute: ActivatedRoute, public navCtrl: NavController) {
    this.diretor = new Diretor();
  }

  ngOnInit() {
  }

  ionViewDidEnter() {
    let id = this.activatedRoute.snapshot.paramMap.get("id")    
    if (id != "0") {
      this.provider.GetDiretor(id).then(retonno => {
        this.diretor = retonno
        console.log(this.diretor)
      }).catch(erro => {
        alert("Erro ao cerregar filme:" + erro)
      })
    }
  }

  salvar(){
    this.provider.SalvarFilme(this.diretor).then(retonno => {
      alert("Diretor salvo com sucesso!")
      this.navCtrl.navigateForward("")
    }).catch(erro => {
      alert("Erro ao salvar diretor:" + erro)
    })
  }
  Excluir(){
    this.provider.DeleleDiretor(this.diretor.id).then(retonno => {
      alert("Diretor excluido!")
      this.navCtrl.navigateForward("");
    }).catch(erro => {
      alert("Erro ao excluir diretor:" + erro)
    })
  }
}
