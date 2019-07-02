import { Component, OnInit } from '@angular/core';
import { Filme } from '../classes';
import { ActivatedRoute } from '@angular/router';
import { ServerService } from '../server.service';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-filme',
  templateUrl: './filme.page.html',
  styleUrls: ['./filme.page.scss'],
})
export class FilmePage implements OnInit {

  filme: Filme;
  constructor(public provider: ServerService, public activatedRoute: ActivatedRoute, public navCtrl: NavController) {
    this.filme = new Filme()
  }

  ngOnInit() {

  }

  ionViewDidEnter() {
    let id = this.activatedRoute.snapshot.paramMap.get("id")    
    if (id != "0") {
      this.provider.GetFilme(id).then(retonno => {
        this.filme = retonno
        console.log(this.filme)
      }).catch(erro => {
        alert("Erro ao cerregar filme:" + erro)
      })
    }
  }

  salvar() {
    this.provider.SalvarFilme(this.filme).then(retonno => {
      alert("Filme salvo com sucesso!")
      this.navCtrl.navigateForward("");
    }).catch(erro => {
      alert("Erro ao salvar filme:" + erro)
    })

  }
  Excluir() {
    this.provider.DeleleFilme(this.filme.id).then(() => {
      alert("Filme excluido!")
      this.navCtrl.navigateForward("");
    }).catch(erro => {
      alert("Erro ao excluir filme:" + erro)
    })
  }

}
