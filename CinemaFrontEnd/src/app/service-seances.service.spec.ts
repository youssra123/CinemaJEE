import { TestBed } from '@angular/core/testing';

import { ServiceSeancesService } from './service-seances.service';

describe('ServiceSeancesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ServiceSeancesService = TestBed.get(ServiceSeancesService);
    expect(service).toBeTruthy();
  });
});
