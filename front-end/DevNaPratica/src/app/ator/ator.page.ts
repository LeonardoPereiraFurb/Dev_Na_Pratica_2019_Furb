import { Component, OnInit } from '@angular/core';
import { Ator } from '../classes';
import { ActivatedRoute } from '@angular/router';
import { ServerService } from '../server.service';

@Component({
  selector: 'app-ator',
  templateUrl: './ator.page.html',
  styleUrls: ['./ator.page.scss'],
})
export class AtorPage implements OnInit {

  ator: Ator;
  constructor(public provider: ServerService, public activatedRoute: ActivatedRoute) { 
    this.ator = new Ator();
  }

  ngOnInit() {
  }

  salvar(){
    console.log(this.ator)
  }
  Excluir(){
    console.log(this.ator)
  }

}
