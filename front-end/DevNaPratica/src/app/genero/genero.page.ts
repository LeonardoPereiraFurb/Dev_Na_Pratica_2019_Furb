import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ServerService } from '../server.service';
import { Genero } from '../classes';

@Component({
  selector: 'app-genero',
  templateUrl: './genero.page.html',
  styleUrls: ['./genero.page.scss'],
})
export class GeneroPage implements OnInit {

  genero: Genero;
  constructor(public provider: ServerService, public activatedRoute: ActivatedRoute) {
    this.genero = new Genero()
  }

  ngOnInit() {
  }

  salvar(){
    console.log(this.genero)
  }
  Excluir(){
    console.log(this.genero)
  }

}
