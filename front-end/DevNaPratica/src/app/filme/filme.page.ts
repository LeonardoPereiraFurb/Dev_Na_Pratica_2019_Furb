import { Component, OnInit } from '@angular/core';
import { Filme } from '../classes';
import { ActivatedRoute } from '@angular/router';
import { ServerService } from '../server.service';

@Component({
  selector: 'app-filme',
  templateUrl: './filme.page.html',
  styleUrls: ['./filme.page.scss'],
})
export class FilmePage implements OnInit {

  filme: Filme;
  constructor(public provider: ServerService, public activatedRoute: ActivatedRoute) {
    this.filme = new Filme()
  }

  ngOnInit() {
  }

  salvar(){
    console.log(this.filme)
  }
  Excluir(){
    console.log(this.filme)
  }

}
