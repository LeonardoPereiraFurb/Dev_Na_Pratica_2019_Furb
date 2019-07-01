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
  public items: Array<Item> ;

  constructor(public route: ActivatedRoute, public provider: ServerService) {
    
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
    }
  }
}
