import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServerService } from '../server.service';
import { Item } from '../classes';

@Component({
  selector: 'app-list',
  templateUrl: 'list.page.html',
  styleUrls: ['list.page.scss']
})


export class ListPage implements OnInit {

  titulo_lista = ''
  public items: Array<Item>;

  constructor(public route: ActivatedRoute, public provider: ServerService) {
    this.items = new Array<Item>();
  }

  ngOnInit() {
  }

  ionViewDidEnter() {
    let tipo = this.route.snapshot.paramMap.get('tipo')
    console.log(tipo)
    if (tipo == '0') {
      this.titulo_lista = "Filmes"
      this.provider.GetListaFilmes().then(filmes => {
        console.log(filmes)
        filmes.forEach(element => {
          let item: Item;
          item.id = element.id
          item.titulo = element.descricao
          this.items.push(item)
        });
      })
    } else if (tipo == '1') {
      this.titulo_lista = "Atores"
      this.provider.GetListaAtores().then(atores => {
        console.log(atores)
        atores.forEach(element => {
          let item: Item;
          item.id = element.id
          item.titulo = element.nome
          this.items.push(item)
        });
      })
    } else if (tipo == '2') {
      this.titulo_lista = "Diretores"
      this.provider.GetListadiretores().then(diretores => {
        console.log(diretores)
        diretores.forEach(element => {
          let item: Item;
          item.id = element.id
          item.titulo = element.nome
          this.items.push(item)
        });
      })
    } else if (tipo == '3') {
      this.titulo_lista = "Generos"
      this.provider.GetListadiretores().then(generos => {
        console.log(generos)
        generos.forEach(element => {
          let item: Item;
          item.id = element.id
          item.titulo = element.nome
          this.items.push(item)
        });
      })
    }
  }
}
