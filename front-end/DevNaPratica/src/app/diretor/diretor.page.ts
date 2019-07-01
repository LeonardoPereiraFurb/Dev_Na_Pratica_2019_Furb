import { Component, OnInit } from '@angular/core';
import { Diretor } from '../classes';
import { ServerService } from '../server.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-diretor',
  templateUrl: './diretor.page.html',
  styleUrls: ['./diretor.page.scss'],
})
export class DiretorPage implements OnInit {

  diretor: Diretor;
  constructor(public provider: ServerService, public activatedRoute: ActivatedRoute) {
    this.diretor = new Diretor();
  }

  ngOnInit() {
  }
  salvar(){
    console.log(this.diretor)
  }
  Excluir(){
    console.log(this.diretor)
  }
}
