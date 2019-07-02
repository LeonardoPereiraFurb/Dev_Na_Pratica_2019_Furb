import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServerService } from '../server.service';
import { Item } from '../classes';
import { NavController } from '@ionic/angular';

@Component({
  selector: 'app-list',
  templateUrl: 'list.page.html',
  styleUrls: ['list.page.scss']
})


export class ListPage implements OnInit {

  titulo_lista = ''
  public items: Array<Item>;
  tipo = ''
  constructor(public route: ActivatedRoute, public provider: ServerService, public navctrl: NavController) {
    this.items = new Array<Item>();
  }

  ngOnInit() {
  }

  ionViewDidEnter() {
    this.tipo = this.route.snapshot.paramMap.get('tipo')

    if (this.tipo == '0') {
      this.titulo_lista = "Filmes"
      this.provider.GetListaFilmes().then(filmes => {
        console.log("filmes", filmes)
        filmes.forEach(element => {
          console.log("element", element.id)
          let item = new Item();
          item.id = element.id
          item.titulo = element.descricao
          this.items.push(item)
        });
      })
    } else if (this.tipo == '1') {
      this.titulo_lista = "Atores"
      this.provider.GetListaAtores().then(atores => {
        console.log(atores)
        atores.forEach(element => {
          let item = new Item();
          item.id = element.id
          item.titulo = element.nome
          this.items.push(item)
        });
      })
    } else if (this.tipo == '2') {
      this.titulo_lista = "Diretores"
      this.provider.GetListadiretores().then(diretores => {
        console.log(diretores)
        diretores.forEach(element => {
          let item = new Item();
          item.id = element.id
          item.titulo = element.nome
          this.items.push(item)
        });
      })
    } else if (this.tipo == '3') {
      this.titulo_lista = "Generos"
      this.provider.GetListaGeneros().then(generos => {
        console.log(generos)
        generos.forEach(element => {
          let item = new Item();
          item.id = element.id
          item.titulo = element.nome
          this.items.push(item)
        });
      })
    }
  }

  ShowCadastro(id) {
    if (this.tipo == '0') {
      this.navctrl.navigateForward("filme/" + id)
    } else if (this.tipo == '1') {
      this.navctrl.navigateForward("ator/" + id)
    } else if (this.tipo == '2') {
      this.navctrl.navigateForward("diretor/" + id)
    } else if (this.tipo == '3') {
      this.navctrl.navigateForward("genero/" + id)
    }
  }
}
