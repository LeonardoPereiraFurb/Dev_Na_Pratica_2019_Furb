import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { reject } from 'q';

@Injectable({
  providedIn: 'root'
})
export class ServerService {

  SERVIDOR = "https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0/rest/furb/basico/entities/"
  headers: HttpHeaders
  constructor(public Http: HttpClient) {

    this.headers = new HttpHeaders().set('Authorization', 'Bearer 3bedb2e37968c60584d5de57798e6965');
  }


  GetFilme(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.SERVIDOR}filme/` + id, { headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }

  GetAtor(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.SERVIDOR}ator/` + id, { headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }

  GetDiretor(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.SERVIDOR}diretor/` + id, { headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }

  GetGenero(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.SERVIDOR}genero/` + id, { headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }


  GetListaFilmes(): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.SERVIDOR}filme`, { headers: this.headers }).subscribe((filmes: any) => {
        console.log(filmes)
        resolve(filmes.contents)
      }, erro => {
        reject(erro.message)
      })
    })

  }

  GetListaAtores(): Promise<any> {
    return new Promise(resolve => {
      this.Http.get(`${this.SERVIDOR}ator`, { headers: this.headers }).subscribe((retorno: any) => {
        console.log(retorno)
        resolve(retorno.contents)
      }, erro => {
        reject(erro.message)
      })
    })
  }

  GetListadiretores(): Promise<any> {
    return new Promise(resolve => {

      this.Http.get(`${this.SERVIDOR}diretor`, { headers: this.headers }).subscribe((retorno: any) => {
        console.log(retorno)
        resolve(retorno.contents)
      }, erro => {
        reject(erro.message)
      })
    })

  }

  GetListaGeneros(): Promise<any> {
    return new Promise(resolve => {

      this.Http.get(`${this.SERVIDOR}genero`, { headers: this.headers }).subscribe((retorno: any) => {
        console.log(retorno)
        resolve(retorno.contents)
      }, erro => {
        reject(erro.message)
      })
    })

  }

  SalvarFilme(filme): Promise<any> {
    return new Promise(resolve => {
      this.Http.post(`${this.SERVIDOR}filme`, filme, { headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })

  }

  SalvarAtor(ator): Promise<any> {
    return new Promise(resolve => {
      this.Http.post(`${this.SERVIDOR}ator`, ator, { headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }

  SalvarDiretor(diretor): Promise<any> {
    return new Promise(resolve => {
      this.Http.post(`${this.SERVIDOR}diretor`, diretor, { headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }

  SalvarGenero(genero): Promise<any> {
    return new Promise(resolve => {
      this.Http.post(`${this.SERVIDOR}ator`, genero, { headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })

  }


  DeleleFilme(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.delete(`${this.SERVIDOR}filme/`+id,{ headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })

  }

  DeleleAtor(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.delete(`${this.SERVIDOR}ator/`+id,{ headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }

  DeleleDiretor(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.delete(`${this.SERVIDOR}diretor/`+id,{ headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }

  DeleleGenero(id): Promise<any> {
    return new Promise(resolve => {
      this.Http.delete(`${this.SERVIDOR}genero/`+id,{ headers: this.headers }).subscribe((retorno: any) => {
        resolve(retorno)
      }, erro => {
        reject(erro.message)
      })
    })
  }







}
