import { NgModule } from '@angular/core';
import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '',  redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', loadChildren: './home/home.module#HomePageModule' },
  { path: 'list/:tipo', loadChildren: './list/list.module#ListPageModule' },
  { path: 'filme/:id', loadChildren: './filme/filme.module#FilmePageModule' },
  { path: 'ator/:id', loadChildren: './ator/ator.module#AtorPageModule' },
  { path: 'genero/:id', loadChildren: './genero/genero.module#GeneroPageModule' },
  { path: 'diretor/:id', loadChildren: './diretor/diretor.module#DiretorPageModule' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })
  ],
  exports: [RouterModule]
})
export class AppRoutingModule {}
