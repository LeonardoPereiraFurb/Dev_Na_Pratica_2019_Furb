import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { reject } from 'q';

@Injectable({
  providedIn: 'root'
})
export class ServerService {

  SERVIDOR = "https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/entities/"
  // headers: HttpHeaders
  constructor(public Http: HttpClient) {


  }

  Salvafilme(filme): Promise<any> {

    return new Promise(resolve => {
      // this.headers = new HttpHeaders().set('Authorization', 'Bearer 3bedb2e37968c60584d5de57798e6965');
      this.Http.post(`${this.SERVIDOR}/filme`, filme, { /**headers: this.headers */ }).subscribe(retorno => {
        resolve(retorno)
      }, erro => {
        reject(erro)
      })
    })
  }

  GetListaFilmes(): Promise<any> {
    return new Promise(resolve => {
      // this.headers.set('Authorization', 'Bearer 3bedb2e37968c60584d5de57798e6965');
      this.Http.get(`${this.SERVIDOR}filme`, { /**headers: this.headers */ }).subscribe((filmes: any) => {
        console.log(filmes)
        resolve(filmes.contents)
      }, erro => {
        reject(erro)
      })
    })

  }

  GetListaAtores(): Promise<any> {
    return new Promise(resolve => {
      // this.headers.set('Authorization', 'Bearer 3bedb2e37968c60584d5de57798e6965');
      this.Http.get(`${this.SERVIDOR}ator`, { /**headers: this.headers */ }).subscribe((retorno: any) => {
        console.log(retorno)
        resolve(retorno.contents)
      }, erro => {
        reject(erro)
      })
    })

  }

  GetListadiretores(): Promise<any> {
    return new Promise(resolve => {
      // this.headers.set('Authorization', 'Bearer 3bedb2e37968c60584d5de57798e6965');
      this.Http.get(`${this.SERVIDOR}diretor`, { /**headers: this.headers */ }).subscribe((retorno: any) => {
        console.log(retorno)
        resolve(retorno.contents)
      }, erro => {
        reject(erro)
      })
    })

  }

  GetListaGeneros(): Promise<any> {
    return new Promise(resolve => {
      // this.headers.set('Authorization', 'Bearer 3bedb2e37968c60584d5de57798e6965');
      this.Http.get(`${this.SERVIDOR}genero`, { /**headers: this.headers */ }).subscribe((retorno: any) => {
        console.log(retorno)
        resolve(retorno.contents)
      }, erro => {
        reject(erro)
      })
    })

  }

  SalvarFilme(filme){

  }

  SalvarAtor(ator){

  }

  SalvarDiretor(diretor){

  }

  SalvarGenero(genero){

  }






}
